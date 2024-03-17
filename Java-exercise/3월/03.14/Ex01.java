public class Ex01 {
    public static void main(String []args){
        // 1부터 100까지의 수 중 짝수와 홀수의 합을 각각 구하시오
        int odd = 0;
        int even = 0;
        for(int i=1; i<101; i++){
            if(i % 2 == 0){
                even += i;
            } else {
                odd += i;
            }
        }
        System.out.printf("짝수 총 합: %s\n홀수 총 합: %s", even, odd);

    }
}
