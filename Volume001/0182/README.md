# Beaker

いろいろな容量のビーカーが与えられています。はじめに、その中の一番容量の大きなビーカーを一個選び、蛇口から水をいっぱいになるまで注ぎます。つぎに、次のルールにしたがいながら、ビーカーの水を他のビーカーに移し替えていきます。

* ビーカーに入っている水は,残さずにすべて他のビーカーに移さなければならない。ただし、一個のビーカーに水を全部移せないときは、複数のビーカーに分けて移してもよい。
* ビーカーに水を入れるとき、いっぱいになるまで水を注がなければならない。また、水をこぼしてはならない。
* 複数のビーカーから同じビーカーに一度に水を注いではならない。
* 同じビーカーには一度しか水を注いではならない。

![][1]

このルールにしたがったとき、ビーカーの個数nと各ビーカーの容量を入力とし、すべてのビーカーに水を注ぐことができるかどうかを判定して出力するプログラムを作成してください。すべてのビーカーに水を注ぐことができるときはYES(半角英大文字)、できないときはNO(半角英大文字)を出力してください。ただし、ビーカーの個数nは1以上50以下の整数とし、ビーカーの容量は1以上100以下の整数で表すこととします。

## Input

複数のデータセットの並びが入力として与えられます。入力の終わりはゼロひとつの行で示されます。各データセットは以下のとおりです。

    1 行目 ビーカーの個数 n (整数)
    2 行目 第1のビーカーの容量 ・・・ 第 n のビーカーの容量 (整数 整数 ・・・ ; 半角空白区切り)

## Output

入力データセット毎に判定結果を出力します。

## Sample Input

    10
    11 2 23 4 2 12 8 5 2 10
    8
    2 1 3 11 2 3 1 4
    9
    5 9 1 2 4 8 17 1 8
    8
    3 38 9 4 18 14 19 5
    1
    1
    0

## Output for the Sample Input

    YES
    YES
    YES
    NO
    YES

* * *

Source: PC Koshien 2008, Preliminary Round , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2008   
<http://www.pref.fukushima.jp/pc-concours/>

[1]: IMAGE1/pck200810.gif
