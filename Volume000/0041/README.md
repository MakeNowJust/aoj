# Expression

与えられた 4 つの 1 から 9 の整数を使って、答えが 10 になる式をつくります。 4 つの整数 a, b, c, d を入力したとき、下記の条件に従い、答えが 10 になる式を出力して終了するプログラムを作成してください。また、答えが複数ある時は、最初に見つかった答えだけを出力するものとします。答えがない時は、0 と出力してください。

* 演算子として、加算 ( )、減算 (-)、乗算 (*) だけを使います。除算 (/) は使いません。使用できる演算子は３個です。
* 数を4つとも使わなければいけません。
* 4つの数の順番は自由に入れ換えてかまいません。
* カッコを使ってもかまいません。使用できるカッコは３組（６個）以下です。

## Input

複数のデータセットが与えられます。各データセットの形式は以下のとおり：

    a b c d

入力は４つの0で終了します。データセットの数は 40 を超えません。

## Output

各データセットについて、与えられた 4 つの整数と上記の演算記号およびカッコを組み合わせて値が 10 となる式または 0　を１行に出力してください。式の文字列が1024文字を超えてはいけません。

## Sample Input

    8 7 9 9
    4 4 4 4
    5 5 7 5
    0 0 0 0

## Output for the Sample Input

    ((9 * (9 - 7)) - 8)
    0
    ((7 * 5) - (5 * 5))
* * *

Source: PC Koshien 2004 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2004   
<http://www.pref.fukushima.jp/pc-concours/>