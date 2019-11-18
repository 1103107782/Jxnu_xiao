package jxnu;
//   定义一个USB接口规范，规定USB接口支持的设备必须遵循什么标准（假设必须有开始工作start，结束finish工作）。
//   抽象一个主板类型Mainboard，模拟USB接口的业务功能的对应一个方法useCard(interface USB)
//   的卡。在一个测试类Test中，演示不同设备类（优盘Flashdisk，鼠标Mouse），当插入主板USB接口后的工作状况。
//   另外，Mouse类还服从Move接口的规范（包含一个行为 move()）
public class Main {

    public static void main(String[] args) {
	// write your code here
        Mainboard mb=new Mainboard();
        USB u;
        u=new Flashdisk();
        mb.useCard(u);
        u=new Mouse();
        mb.useCard(u);

    }
}
