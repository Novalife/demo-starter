package club.daixy.demo.service;

/**
 * @author daixiaoyong
 * @date 2021/1/7 19:11
 * @description 随便定义一个service
 */

public class DemoService {
    public String sayWhat;
    public String toWho;

    public DemoService(String sayWhat, String toWho) {
        this.sayWhat = sayWhat;
        this.toWho = toWho;
    }

    public String say() {
        return this.sayWhat + "!  " + toWho;
    }
}