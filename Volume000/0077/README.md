# Run Length

文字列が連続した場合、ある規則で文字を置き換え文字列を短くすることができます。たとえば、AAAAという文字列の場合、@4Aと表現すれば 1 文字分圧縮されます。この規則で圧縮された文字列を入力してもとの文字列に復元して終了するプログラムを作成してください。ただし、復元した文字列に＠文字は出現しないものとします。

原文の文字列は半角の英大文字、英小文字、数字、記号であり100文字以内、連続する文字は9文字以内です。

## 入力

複数の文字列が与えられます。

## 出力

各文字に対して復元した文字列を１行に出力して下さい。

## Sample Input

    ab@5C1@8050
    @99 1=1@90

## Output for the Sample Input

    abCCCCC10000000050
    999999999 1=1000000000

* * *

Source: PC Koshien 2005 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2005   
(extended format)   
<http://www.pref.fukushima.jp/pc-concours/>