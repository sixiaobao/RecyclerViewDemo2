package comq.example.asus.recyclerviewdemo;

import java.util.List;

/**
 * Created by ASUS on 2017/6/9.
 */

public class Bean {


    /**
     * count : 15
     * movies : [{"actorName1":"汤姆·克鲁斯","actorName2":"索菲亚·宝特拉","btnText":"","commonSpecial":"木乃伊大闹伦敦城阿汤哥迎战","directorName":"艾里克斯·库兹曼","img":"http://img5.mtime.cn/mt/2017/05/15/093545.56698457_1280X720X2.jpg","is3D":true,"isDMAX":true,"isFilter":true,"isHot":true,"isIMAX":false,"isIMAX3D":true,"isNew":true,"length":106,"movieId":207927,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":157,"nearestShowDay":1496995200,"nearestShowtimeCount":2201},"rDay":9,"rMonth":6,"rYear":2017,"ratingFinal":6.1,"titleCn":"新木乃伊","titleEn":"The Mummy","type":"动作 / 冒险 / 奇幻","wantedCount":6298},{"actorName1":"盖尔·加朵","actorName2":"克里斯·派恩","btnText":"","commonSpecial":"用长腿踢开了DC雪耻大门","directorName":"派蒂·杰金斯","img":"http://img5.mtime.cn/mt/2017/06/07/165220.57640158_1280X720X2.jpg","is3D":true,"isDMAX":true,"isFilter":false,"isHot":true,"isIMAX":false,"isIMAX3D":true,"isNew":false,"length":141,"movieId":40205,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":153,"nearestShowDay":1496995200,"nearestShowtimeCount":875},"rDay":2,"rMonth":6,"rYear":2017,"ratingFinal":7.7,"titleCn":"神奇女侠","titleEn":"Wonder Woman","type":"动作 / 冒险 / 奇幻","wantedCount":5913},{"actorName1":"约翰尼·德普","actorName2":"哈维尔·巴登","btnText":"","commonSpecial":"找回了观看系列第一部时的感觉","directorName":"乔阿吉姆·罗恩尼","img":"http://img5.mtime.cn/mt/2017/04/26/104828.45826051_1280X720X2.jpg","is3D":true,"isDMAX":true,"isFilter":false,"isHot":true,"isIMAX":false,"isIMAX3D":true,"isNew":false,"length":129,"movieId":151657,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":146,"nearestShowDay":1496995200,"nearestShowtimeCount":606},"rDay":26,"rMonth":5,"rYear":2017,"ratingFinal":7.6,"titleCn":"加勒比海盗5：死无对证","titleEn":"Pirates of the Caribbean: Dead Men Tell No Tales","type":"动作 / 冒险 / 奇幻","wantedCount":5777},{"actorName1":"张子枫","actorName2":"张逸杰","btnText":"","commonSpecial":"你还记得当年教材上的国民CP吗","directorName":"杨永春","img":"http://img5.mtime.cn/mt/2017/06/08/110129.57576967_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":true,"length":90,"movieId":235695,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":139,"nearestShowDay":1496995200,"nearestShowtimeCount":665},"rDay":9,"rMonth":6,"rYear":2017,"ratingFinal":-1,"titleCn":"李雷和韩梅梅","titleEn":"How Are You","type":"爱情 / 剧情","wantedCount":262},{"actorName1":"阿米尔·汗","actorName2":"法缇玛·萨那·纱卡","btnText":"","commonSpecial":"阿米尔汗领衔摔跤娘子军","directorName":"尼特什·提瓦瑞","img":"http://img5.mtime.cn/mt/2017/05/05/095011.35177856_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":140,"movieId":232932,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":136,"nearestShowDay":1496995200,"nearestShowtimeCount":424},"rDay":5,"rMonth":5,"rYear":2017,"ratingFinal":8.6,"titleCn":"摔跤吧！爸爸","titleEn":"Dangal","type":"喜剧 / 动作 / 家庭","wantedCount":1765},{"actorName1":"迈克尔·法斯宾德","actorName2":"凯瑟琳·沃特森","btnText":"","commonSpecial":"","directorName":"雷德利·斯科特","img":"http://img5.mtime.cn/mt/2017/05/08/105206.12158764_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":true,"isHot":false,"isIMAX":true,"isIMAX3D":false,"isNew":false,"length":116,"movieId":200612,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":85,"nearestShowDay":1497513600,"nearestShowtimeCount":91},"rDay":16,"rMonth":6,"rYear":2017,"ratingFinal":7.9,"titleCn":"异形：契约","titleEn":"Alien: Covenant","type":"恐怖 / 科幻 / 惊悚","wantedCount":6335},{"actorName1":"水田山葵","actorName2":"大原惠美","btnText":"","commonSpecial":"五人组闯南极拯救地球","directorName":"高桥敦史","img":"http://img5.mtime.cn/mt/2017/05/25/115319.63026558_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":101,"movieId":236948,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":61,"nearestShowDay":1496995200,"nearestShowtimeCount":134},"rDay":30,"rMonth":5,"rYear":2017,"ratingFinal":6.8,"titleCn":"哆啦A梦：大雄的南极冰冰凉大冒险","titleEn":"Eiga Doraemon: Nobita no Nankyoku Kachikochi Daibôken","type":"动画","wantedCount":632},{"actorName1":"孙伊涵","actorName2":"宋宁","btnText":"","commonSpecial":"优美清新的青春短小品","directorName":"刘紫微","img":"http://img5.mtime.cn/mt/2017/05/22/152102.47657038_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":true,"length":95,"movieId":232998,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":45,"nearestShowDay":1496995200,"nearestShowtimeCount":106},"rDay":9,"rMonth":6,"rYear":2017,"ratingFinal":-1,"titleCn":"我心雀跃","titleEn":"My Heart Leaps Up","type":"爱情 / 剧情","wantedCount":70},{"actorName1":"陈圆","actorName2":"金光民","btnText":"","commonSpecial":"各大高校灵异事件集","directorName":"九九","img":"http://img5.mtime.cn/mt/2017/06/08/112603.69420636_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":true,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":true,"length":87,"movieId":235831,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":52,"nearestShowDay":1496995200,"nearestShowtimeCount":72},"rDay":9,"rMonth":6,"rYear":2017,"ratingFinal":-1,"titleCn":"碟仙之毕业照","titleEn":"","type":"惊悚 / 恐怖 / 悬疑","wantedCount":53},{"actorName1":"蒋欣","actorName2":"九孔","btnText":"","commonSpecial":"整蛊学渣vs奇葩教师","directorName":"李金瀚","img":"http://img5.mtime.cn/mt/2017/05/17/153308.64405590_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":true,"length":93,"movieId":244986,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":47,"nearestShowDay":1496995200,"nearestShowtimeCount":77},"rDay":9,"rMonth":6,"rYear":2017,"ratingFinal":-1,"titleCn":"麻辣学院","titleEn":"Super Teacher","type":"喜剧","wantedCount":57},{"actorName1":"赵文卓","actorName2":"万茜","btnText":"","commonSpecial":"赵文卓洪金宝万茜抗击倭寇","directorName":"陈嘉上","img":"http://img5.mtime.cn/mt/2017/05/23/114359.60982481_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":120,"movieId":224894,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":7,"nearestShowDay":1496995200,"nearestShowtimeCount":28},"rDay":27,"rMonth":5,"rYear":2017,"ratingFinal":6.7,"titleCn":"荡寇风云","titleEn":"God Of War","type":"动作 / 战争","wantedCount":443},{"actorName1":"高强","actorName2":"于月仙","btnText":"","commonSpecial":"","directorName":"谈宜之","img":"http://img5.mtime.cn/mt/2017/05/18/154316.75973774_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":true,"length":97,"movieId":240417,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":38,"nearestShowDay":1496995200,"nearestShowtimeCount":50},"rDay":9,"rMonth":6,"rYear":2017,"ratingFinal":-1,"titleCn":"忠爱无言","titleEn":"Love Without Words","type":"剧情","wantedCount":107},{"actorName1":"","actorName2":"","btnText":"","commonSpecial":"","directorName":"","img":"http://img5.mtime.cn/mt/2017/06/01/170852.52367427_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":90,"movieId":246820,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":35,"nearestShowDay":1497081600,"nearestShowtimeCount":52},"rDay":10,"rMonth":6,"rYear":2017,"ratingFinal":-1,"titleCn":"内心引力","titleEn":"Go with Your Gut","type":"纪录片","wantedCount":66},{"actorName1":"吕豆","actorName2":"禹祥","btnText":"","commonSpecial":"国王老爸与公主女儿一起冒险","directorName":"刘俊","img":"http://img5.mtime.cn/mt/2017/04/22/131441.45883121_1280X720X2.jpg","is3D":true,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":false,"length":84,"movieId":244238,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":11,"nearestShowDay":1496995200,"nearestShowtimeCount":12},"rDay":27,"rMonth":5,"rYear":2017,"ratingFinal":-1,"titleCn":"我的爸爸是国王","titleEn":"My King My Father","type":"动画 / 喜剧","wantedCount":381},{"actorName1":"甘于晓雪","actorName2":"于博宁","btnText":"","commonSpecial":"","directorName":"陈海帆","img":"http://img5.mtime.cn/mt/2017/05/11/093520.81118242_1280X720X2.jpg","is3D":false,"isDMAX":false,"isFilter":false,"isHot":false,"isIMAX":false,"isIMAX3D":false,"isNew":true,"length":87,"movieId":246564,"nearestShowtime":{"isTicket":true,"nearestCinemaCount":12,"nearestShowDay":1496995200,"nearestShowtimeCount":20},"rDay":9,"rMonth":6,"rYear":2017,"ratingFinal":-1,"titleCn":"异兽来袭","titleEn":"Monster Mayhem","type":"惊悚 / 科幻 / 冒险","wantedCount":101}]
     * totalCinemaCount : 187
     * totalComingMovie : 59
     * totalHotMovie : 61
     */

    private int count;
    private int totalCinemaCount;
    private int totalComingMovie;
    private int totalHotMovie;
    private List<MoviesBean> movies;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotalCinemaCount() {
        return totalCinemaCount;
    }

    public void setTotalCinemaCount(int totalCinemaCount) {
        this.totalCinemaCount = totalCinemaCount;
    }

    public int getTotalComingMovie() {
        return totalComingMovie;
    }

    public void setTotalComingMovie(int totalComingMovie) {
        this.totalComingMovie = totalComingMovie;
    }

    public int getTotalHotMovie() {
        return totalHotMovie;
    }

    public void setTotalHotMovie(int totalHotMovie) {
        this.totalHotMovie = totalHotMovie;
    }

    public List<MoviesBean> getMovies() {
        return movies;
    }

    public void setMovies(List<MoviesBean> movies) {
        this.movies = movies;
    }

    public static class MoviesBean {
        /**
         * actorName1 : 汤姆·克鲁斯
         * actorName2 : 索菲亚·宝特拉
         * btnText :
         * commonSpecial : 木乃伊大闹伦敦城阿汤哥迎战
         * directorName : 艾里克斯·库兹曼
         * img : http://img5.mtime.cn/mt/2017/05/15/093545.56698457_1280X720X2.jpg
         * is3D : true
         * isDMAX : true
         * isFilter : true
         * isHot : true
         * isIMAX : false
         * isIMAX3D : true
         * isNew : true
         * length : 106
         * movieId : 207927
         * nearestShowtime : {"isTicket":true,"nearestCinemaCount":157,"nearestShowDay":1496995200,"nearestShowtimeCount":2201}
         * rDay : 9
         * rMonth : 6
         * rYear : 2017
         * ratingFinal : 6.1
         * titleCn : 新木乃伊
         * titleEn : The Mummy
         * type : 动作 / 冒险 / 奇幻
         * wantedCount : 6298
         */

        private String actorName1;
        private String actorName2;
        private String btnText;
        private String commonSpecial;
        private String directorName;
        private String img;
        private boolean is3D;
        private boolean isDMAX;
        private boolean isFilter;
        private boolean isHot;
        private boolean isIMAX;
        private boolean isIMAX3D;
        private boolean isNew;
        private int length;
        private int movieId;
        private NearestShowtimeBean nearestShowtime;
        private int rDay;
        private int rMonth;
        private int rYear;
        private double ratingFinal;
        private String titleCn;
        private String titleEn;
        private String type;
        private int wantedCount;

        public String getActorName1() {
            return actorName1;
        }

        public void setActorName1(String actorName1) {
            this.actorName1 = actorName1;
        }

        public String getActorName2() {
            return actorName2;
        }

        public void setActorName2(String actorName2) {
            this.actorName2 = actorName2;
        }

        public String getBtnText() {
            return btnText;
        }

        public void setBtnText(String btnText) {
            this.btnText = btnText;
        }

        public String getCommonSpecial() {
            return commonSpecial;
        }

        public void setCommonSpecial(String commonSpecial) {
            this.commonSpecial = commonSpecial;
        }

        public String getDirectorName() {
            return directorName;
        }

        public void setDirectorName(String directorName) {
            this.directorName = directorName;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public boolean isIs3D() {
            return is3D;
        }

        public void setIs3D(boolean is3D) {
            this.is3D = is3D;
        }

        public boolean isIsDMAX() {
            return isDMAX;
        }

        public void setIsDMAX(boolean isDMAX) {
            this.isDMAX = isDMAX;
        }

        public boolean isIsFilter() {
            return isFilter;
        }

        public void setIsFilter(boolean isFilter) {
            this.isFilter = isFilter;
        }

        public boolean isIsHot() {
            return isHot;
        }

        public void setIsHot(boolean isHot) {
            this.isHot = isHot;
        }

        public boolean isIsIMAX() {
            return isIMAX;
        }

        public void setIsIMAX(boolean isIMAX) {
            this.isIMAX = isIMAX;
        }

        public boolean isIsIMAX3D() {
            return isIMAX3D;
        }

        public void setIsIMAX3D(boolean isIMAX3D) {
            this.isIMAX3D = isIMAX3D;
        }

        public boolean isIsNew() {
            return isNew;
        }

        public void setIsNew(boolean isNew) {
            this.isNew = isNew;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getMovieId() {
            return movieId;
        }

        public void setMovieId(int movieId) {
            this.movieId = movieId;
        }

        public NearestShowtimeBean getNearestShowtime() {
            return nearestShowtime;
        }

        public void setNearestShowtime(NearestShowtimeBean nearestShowtime) {
            this.nearestShowtime = nearestShowtime;
        }

        public int getRDay() {
            return rDay;
        }

        public void setRDay(int rDay) {
            this.rDay = rDay;
        }

        public int getRMonth() {
            return rMonth;
        }

        public void setRMonth(int rMonth) {
            this.rMonth = rMonth;
        }

        public int getRYear() {
            return rYear;
        }

        public void setRYear(int rYear) {
            this.rYear = rYear;
        }

        public double getRatingFinal() {
            return ratingFinal;
        }

        public void setRatingFinal(double ratingFinal) {
            this.ratingFinal = ratingFinal;
        }

        public String getTitleCn() {
            return titleCn;
        }

        public void setTitleCn(String titleCn) {
            this.titleCn = titleCn;
        }

        public String getTitleEn() {
            return titleEn;
        }

        public void setTitleEn(String titleEn) {
            this.titleEn = titleEn;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getWantedCount() {
            return wantedCount;
        }

        public void setWantedCount(int wantedCount) {
            this.wantedCount = wantedCount;
        }

        public static class NearestShowtimeBean {
            /**
             * isTicket : true
             * nearestCinemaCount : 157
             * nearestShowDay : 1496995200
             * nearestShowtimeCount : 2201
             */

            private boolean isTicket;
            private int nearestCinemaCount;
            private int nearestShowDay;
            private int nearestShowtimeCount;

            public boolean isIsTicket() {
                return isTicket;
            }

            public void setIsTicket(boolean isTicket) {
                this.isTicket = isTicket;
            }

            public int getNearestCinemaCount() {
                return nearestCinemaCount;
            }

            public void setNearestCinemaCount(int nearestCinemaCount) {
                this.nearestCinemaCount = nearestCinemaCount;
            }

            public int getNearestShowDay() {
                return nearestShowDay;
            }

            public void setNearestShowDay(int nearestShowDay) {
                this.nearestShowDay = nearestShowDay;
            }

            public int getNearestShowtimeCount() {
                return nearestShowtimeCount;
            }

            public void setNearestShowtimeCount(int nearestShowtimeCount) {
                this.nearestShowtimeCount = nearestShowtimeCount;
            }
        }
    }
}
