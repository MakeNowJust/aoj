#include <iostream>
#include <complex>
#include <utility>

using namespace std;

// 座標を複素数として表す
typedef complex<double> point;

int main(void) {
  int n;
  while (cin >> n, n != 0) {
    pair<point, double> wrs[n];  // 円筒形の壁の中心の座標と半径
    // 壁のデータを入力
    for (int i = 0; i < n; i++) {
      double wx, wy, r; cin >> wx >> wy >> r;
      wrs[i] = make_pair(point(wx, wy), r);
    }

    int m; cin >> m;
    for (int i = 0; i < m; i++) {
      double tx, ty, sx, sy; cin >> tx >> ty >> sx >> sy;
      // tがたろう君の座標、sが鬼の座標（どうでもいい）
      point t(tx, ty), s(sx, sy);

      // たろう君と鬼が見つからないかどうか
      bool safe = false;

      // それぞれの壁について、たろう君と鬼が見つからないようにしているか確認する
      for (auto wr : wrs) {
        point w = wr.first;
        double r = wr.second;

        // 点 w と直線 st の距離が半径 r より大きいときたろう君は必ず見つかる
        // conj(c) は c の複素共役を返す
        // conj(c) * d は実部が内積に、虚部が外積になる
        double w_ts = abs((conj(s - t) * (w - t)).imag()) / abs(s - t);
        if (w_ts > r) continue;

        // たろう君と鬼の位置から円の中心までの距離
        double w_t = abs(w - t);
        double w_s = abs(w - s);

            // たろう君と鬼のどちらかが壁の内側にいて、もう一人が外側にいれば見つかることはない
        if (w_t > r ^ w_s > r ||
            // 両方とも外側の場合、線分 st の間に壁があれば見つかることはない
            // ↑つまり、点 w から直線 st へ向かって引いた垂線が線分 st と交差するなら
            w_t > r && w_s > r && (conj(s - t) * (w - t)).real() * (conj(t - s) * (w - s)).real() >= 0) {
          safe = true;
          break;
        }
      }
      cout << (safe ? "Safe" : "Danger") << endl;
    }
  }
  return 0;
}
