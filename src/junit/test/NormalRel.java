package junit.test;

public @interface NormalRel {

	String name();

	String targetSchema();
	

	public enum cardinality{M_TO_N,ONE_TO_N,ONE_TO_ONE,M_TO_ONE};

	String inverse() default "";

	String cardinality();


	public enum Color{ BULE,RED,GREEN};
    
    /**
     * —’…´ Ù–‘
     * @return
     */
    Color fruitColor() default Color.GREEN;

}
