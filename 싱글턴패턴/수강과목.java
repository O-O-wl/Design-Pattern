package 디자인패턴.싱글턴패턴;

public class 수강과목 {
   private static final int 정원 = 3;
   private static int 현재인원 = 0;

   public static void 수강신청() {
       현재인원++;
       수강현황();
   }
   public static boolean 수강가능여부(){
       return 정원 > 현재인원;
   }

   public static void 수강현황() {
       System.out.println("현재 수강현황은 "+현재인원+"/"+정원);
   }
}