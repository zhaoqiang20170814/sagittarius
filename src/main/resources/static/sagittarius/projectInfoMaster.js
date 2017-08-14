/**
 * Created by dongl on 2017/7/22.
 */

$(function () {
    // 加载字典项
    var dataDic;
    $.ajax({
        url: "/commonController/loadDataDicAll",
        async: false,
        success: function (result) {
            dataDic = eval(result);
        }
    });
    // 员工信息
    var userInfo;
    $.ajax({
        url: "/commonController/combobox/userInfo",
        async: false,
        success: function (result) {
            userInfo = eval(result);
        }
    });
    // 加载数据表格
    $('#dg').datagrid({
        fit: true,
        toolbar: '#toolbar',
        url: '/projectInfoMaster/load',
        columns: [[{
            field: 'id',
            title: '主键',
            hidden: true,
        }, {
            field: 'name',
            title: '项目名',
            width: 100,
            align: 'center',
            halign: 'center',
            sortable: false
        }, {
            field: 'status',
            title: '项目状态',
            width: 100,
            align: 'center',
            halign: 'center',
            formatter: function (value) {
                for (var i = 0; i < dataDic.PROJECT_STATUS.length; i++) {
                    if (dataDic.PROJECT_STATUS[i].dictCode == value)
                        return dataDic.PROJECT_STATUS[i].dictCodeName;
                }
                return value;
            },
            sortable: false
        }, {
            field: 'owner',
            title: '项目负责人',
            width: 100,
            align: 'center',
            halign: 'center',
            formatter: function (value) {
                for (var i = 0; i < dataDic.POST.length; i++) {
                    if (userInfo[i].code == value)
                        return userInfo[i].name;
                }
                return value;
            },
            sortable: false
        }, {
            field: 'address',
            title: '项目地址',
            width: 500,
            align: 'left',
            halign: 'center',
            sortable: false
        }, {
            field: 'startTime',
            title: '项目开始时间',
            width: 100,
            align: 'left',
            halign: 'center',
            sortable: false
        }, {
            field: 'programBudget',
            title: '项目预算',
            width: 100,
            align: 'left',
            halign: 'center',
            sortable: false
        }, {
            field: 'realtimeCost',
            title: '项目实时成本',
            width: 100,
            align: 'left',
            halign: 'center',
            sortable: false
        }]],
        loadMsg: '数据装载中......', // 在从远程站点加载数据的时候显示提示消息
        collapsible: true,
        rownumbers: true,
        pagination: true,
        pageSize: 20,
        pageList: [10, 20, 30, 40, 50],
        singleSelect: true, // 不允许复选
        striped: true,
        checkOnSelect: false,
        onLoadError: function () {
            $.messager.alert('错误', '服务器请求发生问题，请联系系统管理员！', 'error');
        },
        onLoadSuccess: function (data) {
        }
    });
    $("#status").combobox("loadData", dataDic.PROJECT_STATUS);
    $("#owner").combobox("loadData", userInfo);
})
/**
 * 新增单位
 */
function newUnit() {
    $('#dlg').dialog('open').dialog('center').dialog('setTitle', '新增');
    $('#fm').form('clear');
    $('#editType').val("new");
}
/**
 * 修改单位
 */
function editUnit() {
    $('#editType').val("edit");
    var row = $('#dg').datagrid('getSelected');
    if (row) {
        $('#dlg').dialog('open').dialog('center').dialog('setTitle', '修改');
        $('#fm').form('load', row);
    }
}
/**
 * 删除单位
 */
function removeUnit() {
    var row = $('#dg').datagrid('getSelected');
    if (row) {
        $.messager.confirm('Confirm', '您是否确定要删除此条数据?(' + row.code + ')', function (r) {
            if (r) {
                $.post('/projectInfoMaster/remove', {id: row.id}, function (result) {
                    if (result.success) {
                        $('#dg').datagrid('reload');    // reload the user data
                    } else {
                        $.messager.show({    // show error message
                            title: '错误',
                            msg: result.message
                        });
                    }
                }, 'json');
                // 刷新页面
                $('#dg').datagrid('reload');    // reload the user data
            }
        });
    }
}
/**
 * 保存按钮
 */
function saveUser() {
    // 获得操作类型
    var editType = $('#editType').val();
    var realurl;
    if (editType == 'new') {
        realurl = '/projectInfoMaster/add';
    } else if (editType == 'edit') {
        realurl = '/projectInfoMaster/edit';
    }
    $('#fm').form('submit', {
        url: realurl,
        onSubmit: function () {
            return $(this).form('validate');
        },
        success: function (result) {
            var result = eval('(' + result + ')');
            if (result.success) {
                // close the dialog
                $('#dlg').dialog('close');
                // reload the user data
                $('#dg').datagrid('reload');
            } else {
                $.messager.show({
                    title: '错误',
                    msg: result.message
                });
            }
        }
    });
}
