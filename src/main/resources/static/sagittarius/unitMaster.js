/**
 * Created by dongl on 2017/7/22.
 */
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
