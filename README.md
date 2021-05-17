# じゃんけんプログラムを作ろう！

時系列（講義で解説した順）になっていますが、難易度が前後しますので、難易度順にチャレンジしても大丈夫です。

## 処理の流れが書ける

難易度：1

### STEP.1
[このコード](https://github.com/hyperkinoko/janken-sample/blob/1f79e02205734a8b65639b4c7529d236c7ab8c01/src/janken_sample/Main.java)を写経して、書いている内容が理解できる。
書き間違い、写し間違いでエラーが起こったときに、VSCodeのチカラを借りたり、お手本のコードと見比べて修正できる。

### STEP.2
上記コードの処理の流れを理解した上で、その流れに沿って自分でコードが書ける。  
エラーが起こったときに、ある程度はVSCodeのチカラを借りて修正できる。

## 列挙型と`toString`が理解できる

難易度：4

### STEP.1
[この時点](https://github.com/hyperkinoko/janken-sample/tree/e209dbd43354c24043b03f6b7a51328951e58f1c/src/janken_sample)でのコードを写経して、書いている内容が理解できる。  
列挙型（enum）の特徴が言える。

### STEP.2
特に`Main.java`の13〜25行目と`JankenHand.java`のコードについて、何をしているかを言える。
`JankenHand`のインスタンスは、3つの固定インスタンスしかなく、それぞれ「グーを表す`JankenHand.Rock`」「チョキを表す`JankenHand.Scissors`」「パーを表す`JankenHand.Paper`」であると理解できている。

### STEP.3
`JankenHand`のコードを見て、`toString`メソッドが、`Object`クラスの`toString`メソッドを「オーバーライド」していることが理解できる。

### STEP.4
`JankenHand`の`displayHand`メソッドと`toString`メソッドは、同じ処理をして同じものを返しているが、この2つの違いを`main`メソッド内の`System.out.println`や`System.out.print`で使うときの観点から説明できる。  
`toString`メソッドをオーバーライドするメリットが理解できている。

### STEP.5
適切に`Object`クラスの`toString`メソッドをオーバーライドするコードが自分で書ける。

## `static`メソッドとその利点が理解できる

### STEP.1
[この時点](https://github.com/hyperkinoko/janken-sample/tree/847a4ae8125e82c3f37ad063c34a07110a54b6f0/src/janken_sample)でのコードを写経して、書いている内容がある程度読める。  
`Math`クラスの`static`メソッドである`max`を呼び出す（使う）方法がわかる。  
`JankenHand`の`static`メソッドである`fromInt`を呼び出す（使う）方法がわかる。

### STEP.2
`JankenHand`の`fromInt`メソッドが引数の数字に応じて、「グー」か「チョキ」か「パー」のインスタンスを返すことが理解できる。

```
JankenHand player = JankenHand.fromInt(2);
```

というコードで、`player`という変数に、「パー」を表すインスタンスである「JankenHand.Paper」が代入されていることがわかる。

### STEP.3
写経で流れを理解した上で、`Main.java`の11行目や18行目が自分で書ける。

### STEP.4

`JankenHand`の`fromInt`メソッドが`static`でなければならない理由が説明できる。  
逆に、`fromInt`メソッドが`static`でないコード（`fromInt`が`static`でない）を実際に書き、どの時点でどのような問題になるか確認できる。

## booleanを返すメソッドの実装や使用ができる

難易度：3

### STEP.1
[この時点](https://github.com/hyperkinoko/janken-sample/tree/b56261d59fecec6d6abb64a624738c15d38f6251/src/janken_sample)でのコードを写経して、書いている内容がある程度読める。

### STEP.2
写経で流れを理解した上で、`Main.java`の22〜28行目が自分で書ける。

### STEP.3
写経で流れを理解した上で、自力で`JankenHand`に`winTo`メソッドと`loseTo`メソッドを実装できる。

## 繰り返し処理が書ける `static`フィールドが定義/使用できる

forループが書ける → 難易度：2
JANKEN_COUNTについて理解する → 難易度：4

### STEP.1
[この時点](https://github.com/hyperkinoko/janken-sample/blob/77e23b234eab4ae9ef681798e2d2635ccd559556/src/janken_sample/Main.java)でのコードを写経して、書いている内容がある程度読める。
書き間違い、写し間違いでエラーが起こったときに、VSCodeのチカラを借りたり、お手本のコードと見比べて修正できる。

### STEP.2
Janken
