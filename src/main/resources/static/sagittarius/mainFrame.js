/**
 * Created by dongl on 2017/7/12.
 */

$(function () {

})

/**
 * 菜单跳转函数
 * @param menuIndex
 */
function jumpMenu(menuIndex) {
    var content, title;
    if (menuIndex == "1-1") {
        // 用户信息界面
        title = '原材料维护';
        content = createFrame("/materialMaster");
    } else if (menuIndex == "1-2") {
        // 用户信息界面
        $("#center").panel('refresh', "http://localhost/basicCRUD.html");
    } else if (menuIndex == "1-3") {
        // 用户信息界面
        $("#center").panel('refresh', "http://localhost/basicCRUD.html");
    } else if (menuIndex == "1-4") {
        // 用户信息界面
        $("#center").panel('refresh', "http://localhost/basicCRUD.html");
    } else if (menuIndex == "1-5") {
        // 用户信息界面
        $("#center").panel('refresh', "http://localhost/basicCRUD.html");
    } else if (menuIndex == "1-6") {
        // 用户信息界面
        $("#center").panel('refresh', "http://localhost/basicCRUD.html");
    } else if (menuIndex == "1-7") {
        // 度量衡信息维护
        title = '度量衡信息维护';
        content = createFrame("/unitMaster");
    }
    $('#mainPanel').panel({
        title: title,
        content: content
    });
}

function createFrame(url) {
    var s = '<iframe scrolling="auto" frameborder="0"  src="' + url + '" style="width:100%;height:100%;"></iframe>';
    return s;
}
