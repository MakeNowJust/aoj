# Trading

取引先の顧客番号（正の整数）と取引日を月ごとに記録したデータがあります。今月のデータと先月のデータを読み込んで、先月から２ヶ月連続で取引のある会社の顧客番号と取引のあった回数を出力して終了するプログラムを作成してください。ただし、月々の取引先数は1000社以内です。

## Input

今月のデータと、先月のデータが１行の空行で区切られて与えられます。各データは以下のような形式です。

    顧客番号, 取引日（全て整数）
    顧客番号, 取引日（全て整数）
    顧客番号, 取引日（全て整数）
    ...
    ...

## Output

    顧客番号1（２つのデータに共通する整数）取引回数1（出現回数）
    顧客番号2（２つのデータに共通する整数）取引回数2（出現回数）
    ...
    ...

※顧客番号が小さい順に顧客番号と取引回数を空白で区切って出力します。

## Sample Input

    123,10
    56,12
    34,14

    123,3
    56,4
    123,5

## Output for the Sample Input

    56 2
    123 3

* * *

Source: PC Koshien 2004 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2004   
<http://www.pref.fukushima.jp/pc-concours/>