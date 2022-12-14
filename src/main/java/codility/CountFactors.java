package codility;

public class CountFactors {

  public int solution(int N) {
    // write your code in Java SE 8
    int factors = 0;

    for (int i=1; i<=Math.sqrt(N); i++) {
      if (N % i == 0) {
        if (i < Math.sqrt(N)) {
          factors+=2;
        } else {
          factors++;
        }
      }
    }
    return factors;
  }

  public static void main(String[] args) {
    System.out.println();
  }

  /**
   * 양의 정수 D는 N = D * M과 같은 정수 M이 존재하는 경우 양의 정수 N의 인수입니다.
   *
   * 예를 들어, M = 4가 위의 조건(24 = 6 * 4)을 충족하기 때문에 6은 24의 인수입니다.
   *
   * 함수 작성:
   *
   * 클래스 솔루션 { 공개 int 솔루션(int N); }
   *
   * 양의 정수 N이 주어지면 해당 요인의 수를 반환합니다.
   *
   * 예를 들어, N = 24일 때 함수는 8을 반환해야 합니다. 24에는 8개의 인수, 즉 1, 2, 3, 4, 6, 8, 12, 24가 있기 때문입니다. 24의 다른 인수는 없습니다.
   *
   * 다음 가정에 대한 효율적인 알고리즘을 작성하십시오.
   *
   * N은 [1..2,147,483,647] 범위의 정수입니다.
   */
}
