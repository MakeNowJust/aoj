import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    scan.useDelimiter("\\s*(\\n|,)\\s*");

    while (scan.hasNextDouble()) {
      // P1
      double x1 = scan.nextDouble();
      double y1 = scan.nextDouble();
      // P2
      double x2 = scan.nextDouble();
      double y2 = scan.nextDouble();
      // Q
      double xq = scan.nextDouble();
      double yq = scan.nextDouble();

      double th = Math.atan((y2 - y1) / (x2 - x1));

      double xr = xq, xr_;
      double yr = yq, yr_;

      // P1中心の座標系にするために平行移動
      xr -= x1;
      yr -= y1;

      // P1-P2をx軸にするために回転
      xr_ = xr; yr_ = yr;
      xr = Math.cos(-th) * xr_ - Math.sin(-th) * yr_;
      yr = Math.sin(-th) * xr_ + Math.cos(-th) * yr_;

      // RはQのP1-P2を対称軸として線対称なので、
      // x軸対称に反転
      yr *= -1;

      // 回転を戻す
      xr_ = xr; yr_ = yr;
      xr = Math.cos(+th) * xr_ - Math.sin(+th) * yr_;
      yr = Math.sin(+th) * xr_ + Math.cos(+th) * yr_;

      // 平行移動を戻す
      xr += x1;
      yr += y1;

      System.out.printf("%f %f\n", xr, yr);
    }
  }
}
