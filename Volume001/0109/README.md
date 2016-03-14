# Smart Calculator

式を入力すると、その値を計算して出力し終了するプログラムを作成してください。

* 式は数値、演算記号、かっこからなり、=で終わります。
* 演算記号は ,-,*,/ の4つで、それぞれ、加算、減算、乗算、除算を表します。
* 四則演算の優先順位は通常の計算と同じとします。すなわち乗算・除算は加算・減算よりも優先され、 同じ優先順位なら左から計算が行われます。
* 0での割り算は発生しないものとします。
* 演算はすべて整数で行い、小数点以下切捨てとします。
* 入力される式の長さは100文字以内で、計算途中の値が　-1 × 109　より小さくなることはなく 109　を超えません。

## Input

複数のデータセットが与えられます。最初にデータセットの数nが与えられます。続いてn行の数式が与えられます。

## Output

各データセットについて、計算結果を出力してください。

## Sample Input

    2
    4-2*3=
    4*(8 4 3)=

## Output for the Sample Input

    -2
    60

* * *

Source: PC Koshien 2005 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2005   
(extended version)   
<http://www.pref.fukushima.jp/pc-concours/>