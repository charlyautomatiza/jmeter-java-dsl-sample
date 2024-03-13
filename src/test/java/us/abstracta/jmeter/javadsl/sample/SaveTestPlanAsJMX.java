package us.abstracta.jmeter.javadsl.sample;

import static us.abstracta.jmeter.javadsl.JmeterDsl.*;

public class SaveTestPlanAsJMX {

  public static void main(String[] args) throws Exception {
    testPlan(
        threadGroup(2, 10,
            httpSampler("https://restful-booker.herokuapp.com/booking")
        )
    ).saveAsJmx("dsl-test-plan.jmx");
  }
}
