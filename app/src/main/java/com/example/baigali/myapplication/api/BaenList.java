package com.example.baigali.myapplication.api;

import java.util.List;

/**
 * @Date 2019/3/27 8:55
 * //                            _ooOoo_
 * //                           o8888888o
 * //                           88" . "88
 * //                           (| -_- |)
 * //                           O\  =  /O
 * //                        ____/`---'\____
 * //                      .'  \\|     |//  `.
 * //                     /  \\|||  :  |||//  \
 * //                     /  _||||| -:- |||||-  \
 * //                     |   | \\\  -  /// |   |
 * //                    | \_|  ''\---/''  |   |
 * //                    \  .-\__  `-`  ___/-. /
 * //                  ___`. .'  /--.--\  `. . __
 * //                ."" '<  `.___\_<|>_/___.'  >'"".
 * //              | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 * //               \  \ `-.   \_ __\ /__ _/   .-` /  /
 * //          ======`-.____`-.___\_____/___.-`____.-'======
 * //                             `=---='
 * //         ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 * //                    佛祖保佑        永无BUG
 * //            佛曰:
 * //                  写字楼里写字间，写字间里程序员；
 * //                  程序人员写程序，又拿程序换酒钱。
 * //                  酒醒只在网上坐，酒醉还来网下眠；
 * //                  酒醉酒醒日复日，网上网下年复年。
 * //                  但愿老死电脑间，不愿鞠躬老板前；
 * //                  奔驰宝马贵者趣，公交自行程序员。
 * //                  别人笑我忒疯癫，我笑自己命太贱；
 * //                  不见满街漂亮妹，哪个归得程序员？
 * //                                        --白嘎力
 */
public class BaenList {


    /**
     * error : false
     * results : [{"_id":"56cc6d1c421aa95caa70752b","createdAt":"2015-11-06T01:54:17.536Z","desc":"11.6","publishedAt":"2015-11-06T04:11:25.973Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1exr0p4r0h3j20oy15445o.jpg","used":true,"who":"张涵宇"},{"_id":"573be98f6776591c9fd0cd5f","createdAt":"2016-05-18T12:03:27.865Z","desc":"518","publishedAt":"2016-05-18T12:18:37.235Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f3zen8idmkj20dw0kun0i.jpg","used":true,"who":"daimajia"},{"_id":"56cc6d26421aa95caa707fd5","createdAt":"2015-12-14T03:20:25.944Z","desc":"12.16","publishedAt":"2015-12-14T04:19:59.761Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bgw1eyz0qixq0wj20hr0qoaek.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7077ef","createdAt":"2015-08-25T04:00:23.169Z","desc":"8/25","publishedAt":"2015-08-25T04:08:30.735Z","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034gw1eveq3prvojj20k00qetbj.jpg","used":true,"who":"daimajia"},{"_id":"56cc6d23421aa95caa707980","createdAt":"2015-11-10T01:45:59.392Z","desc":"11.10","publishedAt":"2015-11-10T05:37:51.792Z","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1exvmxmy36wj20ru114gqq.jpg","used":true,"who":"张涵宇"},{"_id":"57709843421aa95318978e88","createdAt":"2016-06-27T11:06:43.180Z","desc":"6.27","publishedAt":"2016-06-27T11:31:53.48Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034gw1f59lsn7wjnj20du0ku40c.jpg","used":true,"who":"代码家"},{"_id":"56cc6d29421aa95caa708336","createdAt":"2016-02-23T02:24:19.518Z","desc":"2.23","publishedAt":"2016-02-23T05:08:46.837Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1f19241kkpwj20f00hfabt.jpg","used":true,"who":"张涵宇"},{"_id":"595c2f23421aa90ca209c3f0","createdAt":"2017-07-05T08:13:23.237Z","desc":"2017-07-5","publishedAt":"2017-07-05T11:15:30.556Z","source":"chrome","type":"福利","url":"https://ws1.sinaimg.cn/large/610dc034ly1fh8ox6bmjlj20u00u0mz7.jpg","used":true,"who":"daimajia"},{"_id":"576caea6421aa90c875dc46b","createdAt":"2016-06-24T11:53:10.564Z","desc":"6.25","publishedAt":"2016-06-24T12:01:16.638Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034jw1f566a296rpj20lc0sggoj.jpg","used":true,"who":"代码家"},{"_id":"59b5cfb5421aa9118887ac0b","createdAt":"2017-09-11T07:50:13.510Z","desc":"9-11","publishedAt":"2017-09-12T08:15:08.26Z","source":"chrome","type":"福利","url":"https://ws1.sinaimg.cn/large/610dc034ly1fjfae1hjslj20u00tyq4x.jpg","used":true,"who":"代码家"},{"_id":"5bbb0de09d21226111b86f1c","createdAt":"2018-10-08T07:57:20.978Z","desc":"2018-10-08","publishedAt":"2018-10-08T00:00:00.0Z","source":"web","type":"福利","url":"https://ws1.sinaimg.cn/large/0065oQSqly1fw0vdlg6xcj30j60mzdk7.jpg","used":true,"who":"lijinshanmx"},{"_id":"56cc6d23421aa95caa707b7d","createdAt":"2015-06-08T11:40:20.211Z","desc":"6.9\u2014\u2014（1）","publishedAt":"2015-06-09T03:38:07.5Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1eswx1z5iu6j20hs0qo428.jpg","used":true,"who":"张涵宇"},{"_id":"597858e3421aa97de5c7c9b5","createdAt":"2017-07-26T16:54:59.321Z","desc":"7-26","publishedAt":"2017-07-26T16:57:39.343Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034ly1fhxe0hfzr0j20u011in1q.jpg","used":true,"who":"daimajia"},{"_id":"581bd560421aa91376974628","createdAt":"2016-11-04T08:25:04.30Z","desc":"11-4","publishedAt":"2016-11-04T11:48:56.654Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f9frojtu31j20u00u0go9.jpg","used":true,"who":"daimajia"},{"_id":"595d82f6421aa90ca3bb6aaa","createdAt":"2017-07-06T08:23:18.945Z","desc":"07-06","publishedAt":"2017-07-06T11:57:03.770Z","source":"chrome","type":"福利","url":"https://ws1.sinaimg.cn/large/610dc034gy1fh9utulf4kj20u011itbo.jpg","used":true,"who":"代码家"},{"_id":"5b481d01421aa90bba87b9ae","createdAt":"2018-07-13T11:31:13.266Z","desc":"2018-07-13","publishedAt":"2018-07-13T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0073sXn7ly1ft82s05kpaj30j50pjq9v.jpg","used":true,"who":"lijinshanmx"},{"_id":"56d7b07f6776595ac3e5cf92","createdAt":"2016-03-03T11:33:19.706Z","desc":"3.3","publishedAt":"2016-03-03T12:12:56.684Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1f1jionqvz6j20hs0qoq7p.jpg","used":true,"who":"张涵宇"},{"_id":"5b1026ba421aa9029895ba44","createdAt":"2018-06-01T00:45:46.820Z","desc":"2018-06-02","publishedAt":"2018-06-01T00:00:00.0Z","source":"web","type":"福利","url":"http://ww1.sinaimg.cn/large/0065oQSqly1frv03m8ky5j30iz0rltfp.jpg","used":true,"who":"lijinshanmx"},{"_id":"56cc6d23421aa95caa707953","createdAt":"2015-10-21T00:56:57.614Z","desc":"10.21","publishedAt":"2015-10-21T02:57:40.912Z","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bjw1ex8h4lnq3oj20hs0qoadj.jpg","used":true,"who":"张涵宇"},{"_id":"57e1c76c421aa95bd05015f2","createdAt":"2016-09-21T07:34:04.60Z","desc":"9-21","publishedAt":"2016-09-21T11:37:24.210Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034jw1f80uxtwgxrj20u011hdhq.jpg","used":true,"who":"daimajia"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 56cc6d1c421aa95caa70752b
         * createdAt : 2015-11-06T01:54:17.536Z
         * desc : 11.6
         * publishedAt : 2015-11-06T04:11:25.973Z
         * type : 福利
         * url : http://ww4.sinaimg.cn/large/7a8aed7bjw1exr0p4r0h3j20oy15445o.jpg
         * used : true
         * who : 张涵宇
         * source : chrome
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String type;
        private String url;
        private boolean used;
        private String who;
        private String source;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }
    }
}
