package exam10;

public class BirdTreeMain {
	public static void main(String[] args) {
		// 자식은 부모가 될 수 있다. => up casting
		// 업캐스팅 : 부모 것만 사용할 수 있음. 자식 것은 숨겨짐
		BirdTreeCount[] btc = {new Bird("참새"), new Bird("뻐꾸기"), new Bird("앵무새"), new Bird("비둘기"),
				new Tree("감나무"), new Tree("밤나무"), new Tree("상수리나무"), new Tree("느티나무")};
		for(BirdTreeCount btCount : btc) {
			btCount.count();
		}
		System.out.println();
		
		// 부모 것만 사용하는 것 = up casting
		// 다시 자식이 가진 것을 사용하려면 down Casting을 함
		// 다운캐스팅은 자식 => 부모타입에 대입 => 자식타입으로 이것만 가능
		// 다운캐스팅은 부모타입 => 자식 타입으로 바로는 불가능
		
		// down casting(자식=>부모=>자식)
		// 모두가 다운캐스팅이 가능하지 않기에 반드시 다운캐스팅이 가능한지 확인 필요
		// 다운캐스팅이 가능한지 확인하는 메소드 = instanceof
		for(int i=0;i<btc.length;i++) {
			// 다운캐스트 가능한지 검사 => instanceof
			// 1) Bird로 다운캐스팅이 가능한지 확인, 가능하면 fly()라는 메소드를 호출
			if(btc[i] instanceof Bird) { // 부모 타입이 자식타입으로 타입(형변환)이 가능하면
				// (Bird) btc[i] => 부모타입인 btc[i]를 자식 타입으로 강제 타입변환(형변환)
				((Bird)btc[i]).fly();
			}
			// 2) Tree로 다운 캐스팅이 가능한지 확인, 가능하면 ripen()라는 메소드를 호출
			if(btc[i] instanceof Tree) {
				((Tree)btc[i]).ripen();
			}
		}
		
		// 익명 구현 객체
		BirdTreeCount anyBtc = new BirdTreeCount() {
			
			@Override
			public void count() {
				// TODO Auto-generated method stub
				System.out.println("부모 인터페이스 메소드, 구현 메소드");
				
			}
		};
		anyBtc.count();
	}
}