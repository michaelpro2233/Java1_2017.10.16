package ru.spec.java1.lec5;

public class Outer {

	private int i;

	public static class StaticNested extends Outer {
		public StaticNested() {
		}

		public int getI() {
			return ((Outer) this).i;
		}
	}

	public class Nested {
		public Nested() {
			i = 5;
		}

	}

	public static void main(String[] args) {
		// new ru.spec.java1.lec5.Outer();
		new ru.spec.java1.lec5.Outer.StaticNested();

		System.out.println(new StaticNested().getI());

		Outer outer = new Outer();
		outer.new Nested();

		for (int i = 0; i < 10; i++) {
			final int tmp = i;
			class Inner {

				public void m() {
					System.out.println(tmp);
				}
			}
			new Inner().m();

			class Bing extends WebSite {

				@Override
				public String getTitle() {
					return "Bing";
				}

			}

			new Bing();

			WebSite site = new WebSite() {

				@Override
				public String getTitle() {
					// TODO Auto-generated method stub
					return "Yahoo";
				}
			};

		}
	}

}