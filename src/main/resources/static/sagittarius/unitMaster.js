/**
 * Created by dongl on 2017/7/22.
 */

$(function () {
    // 加载数据表格
    $('#dg').datagrid({
        fit: true,
        toolbar: '#toolbar',
        url: '/unitMaster/init',
        columns: [[{
            field: 'ck',
            width: 50,
            checkbox: true,
            align: 'center'
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
    $('#dlg').dialog('open').dialog('center').dialog('setTitle', 'New User');
    $('#fm').form('clear');
}
/**
 * 修改单位
 */
function editUnit() {
    var row = $('#dg').datagrid('getSelected');
    if (row) {
        $('#dlg').dialog('open').dialog('center').dialog('setTitle', 'Edit User');
        $('#fm').form('load', row);
        url = 'update_user.php?id=' + row.id;
    }
}
/**
 * 删除单位
 */
function removeUnit() {
}
