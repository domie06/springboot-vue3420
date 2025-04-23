const base = {
    get() {
        return {
            url : "http://localhost:8080/fuzhuangpinpaituiguangjiyingyong/",
            name: "fuzhuangpinpaituiguangjiyingyong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/fuzhuangpinpaituiguangjiyingyong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "服装品牌的推广及应用网站"
        } 
    }
}
export default base
