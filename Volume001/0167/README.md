# Bubble Sort

データを並べ替えるための整列（ソート）アルゴリズムはコンピュータ科学には欠かせない基本的なアルゴリズムです。例えば、下図のように「整数値の配列の要素を昇順に並べ替える」というのが整列です。

![][1]

多くの整列アルゴリズムが存在しますが、その中でも基本的なアルゴリズムの１つがバブルソートです。例として、与えられた整数値の配列をバブルソートで昇順に並べてみます。

![][2]

バブルソートでは、各計算ステップにおいて、配列を「ソートされた部分」と「ソートされていない部分」に分けて考えます。最初は配列全体がソートされていない部分になります。

![][3]

ソートされていない部分の先頭から、隣同士の要素を比較して（図では緑色の要素）、大きい値が右にくるようにそれらを交換します。二つの値が等しい場合は交換しません。この処理をソートされていない部分（図では白色の要素）の末尾まで繰り返します。最後に、末尾をソートされている部分（図では青色の要素）に追加して1ステップが完了します。

![][4]

このステップをソートされていない部分の長さが1になるまで繰 り返します。

![][5]

![][6]

このようにソートされていない部分の長さが1になったら、ソー トの処理を終了します。

それでは、n個の数値の配列を入力とし、数値が配列の先頭から昇順に並ぶように上記のバブルソートの手順で並べ替えを行い、要した配列要素の交換回数を出力するプログラムを作成してください。ただし、nは1以上100以下とし、入力される数値は1以上1000000以下の整数とします。また、配列の先頭の数値から順に入力されるものとします。

プログラムは以下に定義する入力が続く限り処理を繰り返し、入力が終わったら終了するように作成してください。

## Input

複数のデータセットの並びが入力として与えられます。入力の終わりはゼロひとつの行で示されます。各データセットは以下のとおりです。

    1行目 数値の数 n (整数)
    2行目 第1の数値（整数）
    3行目 第2の数値
    ：
    ：
    n 1行目 第nの数値

## Output

入力データセットごとにデータ要素の交換回数（整数）を出力します。

## Sample Input

    5
    5
    3
    2
    1
    4
    6
    1
    2
    3
    4
    5
    6
    3
    3
    2
    1
    0

## Output for the Sample Input

    7
    0
    3

* * *

Source: PC Koshien 2007 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2007   
<http://www.pref.fukushima.jp/pc-concours/>

[1]: IMAGE1/bubbleSort1.jpg
[2]: IMAGE1/bubbleSort2.bmp
[3]: IMAGE1/bubbleSort3.bmp
[4]: IMAGE1/bubbleSort4.bmp
[5]: IMAGE1/bubbleSort5.bmp
[6]: IMAGE1/bubbleSort6.bmp
