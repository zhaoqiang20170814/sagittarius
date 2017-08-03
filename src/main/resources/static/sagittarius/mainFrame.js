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
        // 原材料分类
        title = '原材料分类维护';
        content = createFrame("/materialTypeMaster");
    } else if (menuIndex == "1-2") {
        // 用户信息界面
        $("#center").panel('refresh', "http://localhost/basicCRUD.html");
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
        // 成本一级分类信息界面
        title = '成本一级分类信息维护';
        content = createFrame("/classificationLevelOneMaster");
    } else if (menuIndex == "1-7") {
        // 成本二级分类信息界面
        title = '成本一级分类信息维护';
        content = createFrame("/classificationLevelTwoMaster");
    } else if (menuIndex == "1-8") {
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
