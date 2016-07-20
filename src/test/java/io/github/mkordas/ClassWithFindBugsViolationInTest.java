package io.github.mkordas;

public class ClassWithFindBugsViolationInTest {
		
		private String name;
		
		public void methodThrowingException() throws Exception {
		}
	
    private void unusedPrivateMethod() {
    }
		
		public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
