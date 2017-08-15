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
        // 原材料一级分类维护
        title = '原材料一级分类维护';
        content = createFrame("/materialTypeLevelOneMaster");
    } else if (menuIndex == "1-2") {
        // 原材料二级分类维护
        title = '原材料二级分类维护';
        content = createFrame("/materialTypeLevelTwoMaster");
    } else if (menuIndex == "1-3") {
        // 用户信息维护
        title = '用户信息维护';
        content = createFrame("/userMaster");
    } else if (menuIndex == "1-4") {
        // 车辆信息维护
        title = '车辆信息维护';
        content = createFrame("/carMaster");
    } else if (menuIndex == "1-5") {
        // 报销项目信息界面
        title = '报销项目信息维护';
        content = createFrame("/expenseTypeMaster");
    } else if (menuIndex == "1-6") {
        // 成本分类信息界面
        title = '成本分类信息维护';
        content = createFrame("/costTypeMaster");
    } else if (menuIndex == "1-7") {
        // 成本项目信息界面
        title = '成本项目信息维护';
        content = createFrame("/costItemMaster");
    } else if (menuIndex == "1-8") {
        // 度量衡信息维护
        title = '度量衡信息维护';
        content = createFrame("/unitMaster");
    } else if (menuIndex == "1-9") {
        // 原料信息维护
        title = '原料信息维护';
        content = createFrame("/materialMaster");
    } else if (menuIndex == "2-1") {
        // 项目信息维护
        title = '项目信息维护';
        content = createFrame("/projectInfoMaster");
    }
    // 刷新主界面
    refreshMainPanel(title, content);
}

function createFrame(url) {
    var s = '<iframe scrolling="auto" frameborder="0"  src="' + url + '" style="width:100%;height:100%;"></iframe>';
    return s;
}

/**
 * 刷新主界面
 * @param title
 * @param content
 */
function refreshMainPanel(title, content) {
    $('#mainPanel').panel({
        title: title,
        content: content
    });
}
