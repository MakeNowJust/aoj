# Caesar Cipher

文字のアルファベットを、何文字かずらしたアルファベットに置き換えて作られる暗号をシーザー暗号といいます。例えば、アルファベットを１文字ずらし、a を b に、b を c に、y を z に、z を a に置き換えることによって、文を暗号化することができます。その場合、

    this is a pen

という文字は

    uijt jt b qfo

と暗号化されます。

シーザー暗号によって暗号化されたデータを入力として受け取り、復号されたデータを出力するプログラムを作成して下さい。何文字ずらしたかは秘密ですし、各データによって異なります。ただし、暗号化する前のデータは the, this, that という単語のいずれかを含む英語の文章ですので、それを手がかりに復号して下さい。

１つの考えられるプログラムは、暗号化で１文字ずらしたと仮定して復号してみる、２文字ずらしたと仮定して復号してみる、という処理を繰り返し、復号されたデータに the, this, that のいずれかが含まれるならばそれを出力して終了するというものでしょう。

暗号化されたデータに含まれる文字は、アルファベットの小文字、ピリオド、空白、改行のみです。暗号化にあたり、アルファベット以外の文字は置き換えられていません。暗号化されたデータは空白、ピリオド、改行を含めて 80 文字以下です。

## Input

複数のデータセットが与えられます。各データセットに暗号化された文字列が１行に与えられます。入力の最後まで処理して下さい。

## Output

各データセットに対して、復号した文を１行に出力して下さい。

## Sample Input

    xlmw mw xli tmgxyvi xlex m xsso mr xli xvmt.

## Output for the Sample Input

    this is the picture that i took in the trip.

* * *

Source: PC Koshien 2003 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2003   
<http://www.pref.fukushima.jp/pc-concours/>