public class GstCal {

  static double Calc(int qty, int rate, double gst) {
    double f = ((qty*rate)+(qty *rate*gst));
    return f;
  }


  public static void main(String[] args) {

    System.out.println(Calc(1, 100, 0.05));


  }

}
