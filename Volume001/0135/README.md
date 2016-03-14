# Clock Short Hand and Long Hand

| ----- |
|

原始スローライフ主義組織「アカルイダ」から、いたずらの予告状が届きました。アカルイダといえば、要人の顔面にパイを投げつけたりするいたずらで有名ですが、最近では火薬を用いてレセプション会場にネズミ花火をまき散らすなど、より過激化してきました。

 |  ![][1]  |

予告状は次の文面です。

    ---パソコン ヒトの時間を奪う。良くない。
    時計の短い針と長い針 出会うころ、アカルイダ 正義行う。
    スローライフ 偉大なり。

たどたどしくてよく解らないのですが、時計の短針と長針とが重なった ころにいたずらを決行するという意味のようです。

このいたずらを警戒するため、時刻を入力として、短針と長針が近い場合は"alert"、遠い場合は"safe"、それ以外の場合は"warning"と出力して終了するプログラムを作成してください。ただし、「近い」とは短針と長針の角度が0°以上30°未満の場合をいい、「遠い」とは90°以上180°以下の場合をいいます。なお、時刻は00:00以上11:59以下とします。

## Input

    1行目 判定する時刻の個数n（1以上10000以下の整数）
    2行目 第1の時刻 hh:mm（整数：整数；半角コロン区切り）
    3行目 第2の時刻 hh:mm（整数：整数；半角コロン区切り）
    ：
    ：
    n 1行目 第nの時刻 hh:mm（整数：整数；半角コロン区切り）

## Output

    1行目 第1の時刻の判定結果 safe、warning、 または alert
    2行目 第2の時刻の判定結果 safe、warning、 または alert
    ：
    ：
    n行目 第nの時刻の判定結果 safe、warning、 または alert

## Sample Input

    4
    02:15
    06:01
    11:55
    10:40

## Output for the Sample Input

    alert
    safe
    alert
    warning

* * *

Source: PC Koshien 2006 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2006   
<http://www.pref.fukushima.jp/pc-concours/>

[1]: IMAGE1/watch.gif
