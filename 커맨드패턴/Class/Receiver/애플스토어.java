package 디자인패턴.커맨드패턴.Class.Receiver;

public class 애플스토어 {


    class 아이폰 {
        String 색상;
        int 시리즈;
        int 용량;

        public 아이폰(String 색상, int 시리즈, int 용량) {
            this.색상 = 색상;
            this.시리즈 = 시리즈;
            this.용량 = 용량;
        }

        public String toString() {
            return "아이폰"+시리즈+"📱"+색상+"("+용량+")";
        }
    }

    class 애플워치 {
        String 소재;
        int 시리즈;
        int 용량;

        public 애플워치(String 소재, int 시리즈, int 용량) {
            this.소재 = 소재;
            this.시리즈 = 시리즈;
            this.용량 = 용량;
        }

        public String toString() {
            return "애플워치"+시리즈+"⌚️"+소재+"("+용량+")";
        }
    }

    class 맥북 {
        String 색상;
        String 라인;
        int 용량;
        boolean 키보드마우스추가;

        public 맥북(String 색상, String 라인, int 용량,boolean 키보드마우스추가) {
            this.색상 = 색상;
            this.라인 = 라인;
            this.용량 = 용량;
            this.키보드마우스추가 = 키보드마우스추가;
        }

        public String toString() {
            String 키보드마우스 = 키보드마우스추가 ? "🖱⌨️" : "";
            return "맥북"+라인+"💻"+색상+"("+용량+")" + 키보드마우스;
        }
    }

    public 아이폰 아이폰주문(String 색상, int 시리즈, int 용량) {
        return new 아이폰(색상,시리즈,용량);
    }

    public 맥북 맥북주문(String 색상, String 라인, int 용량,boolean 키보드마우스추가여부) {
        return new 맥북(색상,라인,용량,키보드마우스추가여부);
    }

    public 애플워치 애플워치주문(String  소재, int 시리즈, int 용량) {
        return new 애플워치(소재,시리즈,용량);
    }


}
