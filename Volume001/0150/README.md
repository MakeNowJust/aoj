# Twin Prime

素数は暗号、符号、通信、計測などに広く利用されています。 素数の中でも「5と7」「11と13」のような差が2となる素数の組を双子素数と言います。 双子素数を構成する素数のうち大きい素数をその双子素数の大きさと呼ぶことにします。 入力された整数 n 以下の双子素数で大きさが最大のものを出力し終了するプログラムを作成してくだ さい。 n は 5 以上 10,000 以下とします。

## Input

複数のデータセットの並びが入力として与えられます。入力の終わりはゼロひとつの行で示されます。 各データセットは以下のとおりです。

    n（整数）

## Output

入力データセットごとに以下の形式で出力します。

    n に対する双子素数p1 q1（整数 整数；半角空白区切り）
    p1：双子素数を構成する小さい素数
    q1：双子素数を構成する大きい素数

## Sample Input

    12
    100
    200
    300
    0

## Output for the Sample Input

    5 7
    71 73
    197 199
    281 283

* * *

Source: PC Koshien 2007, Preliminary Round , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2007   
<http://www.pref.fukushima.jp/pc-concours/>
