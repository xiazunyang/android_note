### 状态管理

* 使用Int值记录多个boolean状态
```
STATE_1		0x0001		00000001
STATE_2		0x0002		00000010
STATE_3		0x0004		00000100
STATE_4		0x0008		00001000
STATE_5		0x0010		00010000
STATE_6		0x0020		00100000
STATE_7		0x0040		01000000
STATE_8		0x0080		10000000


初始值：
currentState 00000000

添加STATE_4：
currentState add(STATE_4)

计算：
currentState  		00000000
STATE_4		  |	00001000
                        ________
currentState  =		00001000

添加STATE_6：
currentState add(STATE_6)

计算：
currentState    	00001000
STATE_6		  |	00100000
                        ________
currentState  =		00101000

判断是否有 STATE_6
        currentState	00101000
                &	00100000
                        ________
result		 =	00100000

如果result不等于0，就表示有，否则表示没有


移除STATE_6（分两步）：

1.先将STATE_6取反：

STATE_6		00100000
               ~________
取反结果：	11011111

2.将取反结果与当前状态进行位与运算
    currentState	00101000
                &	11011111
                        ________
newState		00001000

```