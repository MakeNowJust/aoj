# Affine Cipher

簡単な暗号法の一つに、アフィン暗号というものがあります。まず、アルファベット a〜z を a = 0, b = 1, c = 2,..., x = 23, y = 24, z = 25 と 0〜25 の数字に置き換えます。そして、以下の式で、原文のアルファベットを置換します。

F(γ) = (α・γ＋β) mod 26

ただし、mod 26 は 26 で割った余りを表します。。たとえば、α = 3; β = 2 のとき、アルファベットの'a'(=0) は、F(0) = (3・0 2) mod 26 = 2 で'c'に、アルファベットの'n'(=13) は F(13) = (3・13 2) mod 26 = 15 で'p' に置換されます。 このとき、γ に対する F(γ) が必ず 1 対 １で対応付けられるように、αとβは慎重に選ばれているものとします（αと26が互いに素であることが条件）。α = 4、β = 7 のときのように、F(a) = 7 , F(n) = 7 と、'a' も'n' も同じ'h' に置換されるようなことはありません。また、アルファベット以外の文字は置換されません。暗号化された文字列を元の文章に復号したものを出力して終了するプログラムを作成してください。元の文章には、キーワードとして

    that
    this

のいずれかが必ず含まれていることとします。

## Input

複数のデータセットが与えられます。一行目にデータセット数 n が与えられます。続いてｎ行のデータが与えられます。各データセットに半角の英小文字と空白からなる256 文字以内の暗号化された文章が１行に与えられます。

## Output

各データセットに対して、復号した元の文章を１行に出力して下さい。

## Sample Input

    1
    y eazqyp pnop pngtg ye obmpngt xmybp mr lygw

## Output for the Sample Input

    i submit that there is another point of view

* * *

Source: PC Koshien 2004 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2004   
<http://www.pref.fukushima.jp/pc-concours/>