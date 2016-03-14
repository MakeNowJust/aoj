# A Point in a Triangle

平面上に (x1, y1), (x2, y2), (x3, y3) を頂点とした三角形と点 P(xp, yp) があります。点 P が三角形の内部(三角形の頂点や辺上は含まない)にあるなら YES、三角形の外部にあるなら NO を出力して終了するプログラムを作成して下さい。

なお、与える点 P は三角形の頂点や辺の上にはないものとし、x1, y1, x2, y2, x3, y3 xp, yp は、それぞれ -100 以上 100 以下とします。

## Input

複数のデータセットが与えられます。各データセットの形式は以下のようになっています。

    x1 y1 x2 y2 x3 y3 xp yp

与えられる入力は全て実数です。入力の最後まで処理して下さい。データセットの数は 100 を超えません。

入力は次の条件を満たします：

* 三角形の辺の長さは 1.0 以上である
* 三角形の辺と点Pの距離が 0.001 より小さくなることはない

## Output

書くデータセットに対して、YES または NO を１行に出力して下さい。

## Sample Input

    0.0 0.0 2.0 0.0 2.0 2.0 1.5 0.5
    0.0 0.0 1.0 4.0 5.0 3.0 -1.0 3.0

## Output for the Sample Input

    YES
    NO

* * *

Source: PC Koshien 2003 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2003   
<http://www.pref.fukushima.jp/pc-concours/>