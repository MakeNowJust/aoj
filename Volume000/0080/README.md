# Third Root

![][1] の解は漸化式 ![][2] を計算していくことで近似的に求めることができます。

![][3]に正の数 ![][4]をいれ

![][5] 、![][6] 、…　と計算します。

この計算をしながら、

![][7] の値が、十分小さくなったところで、計算をやめ、最後に計算した ![][8]を

![][9]の近似解とします。

この方法に従って、入力された正の整数 _q_ に対し、 _q_ の３乗根の近似値を出力して終了するプログラムを作成してください。ただし、「十分小さくなった」という判定は![][10]を用いてください。

## 入力

複数のデータセットが与えられる。各データセットに_q_ (1 ≤ _q_ < 231)（整数）が一行に与えられる。入力の終わりは-1である。

データセットの数は50を超えない。

## 出力

各データセットに対して_x_ （実数）を１行に出力する。出力結果に0.00001以下の誤差を含んでもよい。

## Sample Input

    15
    15
    -1

## Output for the Sample Input

    2.466212
    2.466212

* * *

Source: PC Koshien 2005 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2005   
(extended format)   
<http://www.pref.fukushima.jp/pc-concours/>

[1]: IMAGE1/08_1.gif
[2]: IMAGE1/08_2.gif
[3]: IMAGE1/08_3.gif
[4]: IMAGE1/08_4.gif
[5]: IMAGE1/08_5.gif
[6]: IMAGE1/08_6.gif
[7]: IMAGE1/08_7.gif
[8]: IMAGE1/08_8.gif
[9]: IMAGE1/08_9.gif
[10]: IMAGE1/08_10.gif
