/**
 * Created by dongl on 2017/7/22.
 */

$(function () {
    // 加载数据表格
    $('#dg').datagrid({
        fit: true,
        toolbar: '#toolbar',
        url: '/unitMaster/load',
        columns: [[{
            field: 'ck',
            width: 50,
            checkbox: true,
            align: 'center'
        }, {
            field: 'id',
            title: '主键',
            hidden: true,
        }, {
            field: 'code',
            title: '单位编号',
            width: 150,
            align: 'center',
            halign: 'center',
            sortable: true
        }, {
            field: 'name',
            title: '单位名称',
            width: 150,
            align: 'center',
            halign: 'center',
            sortable: true
        }]],
        loadMsg: '数据装载中......', // 在从远程站点加载数据的时候显示提示消息
        collapsible: true,
        rownumbers: true,
        pagination: true,
        pageSize: 20,
        pageList: [10, 20, 30, 40, 50],
        rownumbers: false,
        singleSelect: false, // 不允许复选
        striped: true,
        checkOnSelect: false,
        onLoadError: function () {
            $.messager.alert('错误', '服务器请求发生问题，请联系系统管理员！', 'error');
        },
        onLoadSuccess: function (data) {
        }
    });
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
        url = 'update_user.php?id=' + row.id;
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
                $.post('/unitMaster/remove', {id: row.id}, function (result) {
                    if (result.success) {
                        $('#dg').datagrid('reload');    // reload the user data
                    } else {
                        $.messager.show({    // show error message
                            title: 'Error',
                            msg: result.errorMsg
                        });
                    }
                }, 'json');
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
     if(editType == 'new') {
         realurl = '/unitMaster/add';
     }else if(editType == 'edit'){
         realurl = '/unitMaster/edit';
     }
    $('#fm').form('submit', {
        url: realurl,
        onSubmit: function () {
            return $(this).form('validate');
        },
        success: function (result) {
            var result = eval('(' + result + ')');
            if (result.errorMsg) {
                $.messager.show({
                    title: 'Error',
                    msg: result.errorMsg
                });
            } else {
                $('#dlg').dialog('close');        // close the dialog
                $('#dg').datagrid('reload');    // reload the user data
            }
        }
    });
}
