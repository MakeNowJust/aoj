# Leap Year

西暦 _a_ 年から _b_ 年までの間にあるすべてのうるう年を出力して終了するプログラムを作成してください。

うるう年の条件は、次のとおりとします。ただし、0 < _a_ ≤ _b_ < 3,000 とします。与えられた期間にうるう年がない場合には"NA"と出力してください。

* 西暦年が 4 で割り切れる年であること。
* ただし、100 で割り切れる年はうるう年としない。
* しかし、400 で割り切れる年はうるう年である。

## Input

複数のデータセットが与えられます。各データセットの形式は以下のとおりです：

    a b

a, b がともに 0 のとき入力の終了とします。

## Output

各データセットごとに、西暦または NA(半角英大文字)を出力してください。

データセットの間に１つの空行を入れてください。

## Sample Input

    2001 2010
    2005 2005
    2001 2010
    0 0

## Output for the Sample Input

    2004
    2008

    NA

    2004
    2008

* * *

Source: PC Koshien 2005 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2005   
(modified format)   
<http://www.pref.fukushima.jp/pc-concours/>