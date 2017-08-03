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
    // 加载数据表格
    $('#dg').datagrid({
        fit: true,
        toolbar: '#toolbar',
        url: '/userMaster/load',
        columns: [[{
            field: 'id',
            title: '主键',
            hidden: true,
        }, {
            field: 'code',
            title: '编号',
            width: 150,
            align: 'center',
            halign: 'center',
            sortable: false
        }, {
            field: 'sex',
            title: '性别',
            width: 150,
            align: 'center',
            halign: 'center',
            formatter: function (value) {
                var text;
                if ('F' == value) {
                    text = "男";
                } else if ("M" == value) {
                    text = "女";
                }
                return text;
            },
            sortable: false
        }, {
            field: 'age',
            title: '年龄',
            width: 150,
            align: 'center',
            halign: 'center',
            editor: {
                type: 'numberbox',
                options: {
                    precision: 0,
                    max: 99
                }
            },
            sortable: false
        }, {
            field: 'post',
            title: '职位',
            width: 150,
            align: 'center',
            halign: 'center',
            formatter: function (value) {
                for (var i = 0; i < dataDic.POST.length; i++) {
                    if (dataDic.POST[i].dictCode == value)
                        return dataDic.POST[i].dictCodeName;
                }
                return value;
            },
            sortable: false
        }, {
            field: 'department',
            title: '所属部门',
            width: 150,
            align: 'center',
            halign: 'center',
            formatter: function (value) {
                for (var i = 0; i < dataDic.DEPARTMENT.length; i++) {
                    if (dataDic.DEPARTMENT[i].dictCode == value)
                        return dataDic.DEPARTMENT[i].dictCodeName;
                }
                return value;
            },
            sortable: false
        }, {
            field: 'contact',
            title: '联系电话',
            width: 150,
            align: 'center',
            halign: 'center',
            sortable: false
        }, {
            field: 'idNumber',
            title: '身份证号',
            width: 150,
            align: 'center',
            halign: 'center',
            sortable: false
        }]],
        loadMsg: '数据装载中......', // 在从远程站点加载数据的时候显示提示消息
        collapsible: true,
        rownumbers: true,
        pagination: true,
        pageSize: 20,
        pageList: [10, 20, 30, 40, 50],
        singleSelect: false, // 不允许复选
        striped: true,
        checkOnSelect: false,
        onLoadError: function () {
            $.messager.alert('错误', '服务器请求发生问题，请联系系统管理员！', 'error');
        },
        onLoadSuccess: function (data) {
        }
    });
    $("#post").combobox("loadData", dataDic.POST);
    $("#department").combobox("loadData", dataDic.DEPARTMENT);
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
                $.post('/userMaster/remove', {id: row.id}, function (result) {
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
        realurl = '/userMaster/add';
    } else if (editType == 'edit') {
        realurl = '/userMaster/edit';
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
