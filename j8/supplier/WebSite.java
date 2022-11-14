package com.example.test.j8.supplier;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/11/12
 */
public class WebSite {

    private String webSiteName;

    private String target;

    public WebSite(String webSiteName, String target) {
        this.webSiteName = webSiteName;
        this.target = target;
    }

    public String getWebSiteName() {
        return webSiteName;
    }

    public void setWebSiteName(String webSiteName) {
        this.webSiteName = webSiteName;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
