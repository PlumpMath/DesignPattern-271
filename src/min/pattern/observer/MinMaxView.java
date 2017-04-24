package min.pattern.observer;

import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer {

	private ScoreRecord ScoreRecord;
	
	
	
	public MinMaxView(ScoreRecord scoreRecord) {
		this.ScoreRecord = scoreRecord;
	}



	@Override
	public void update() {//점수의 변경을 통보받음

		List<Integer> record = ScoreRecord.getScoreRecord();//점수를 조회함
		displayMinMax(record);// 최소 값과 최대 값을 출력함
		
	}
	
	private void displayMinMax(List<Integer> record){
		
		int min = Collections.min(record, null);
		int max = Collections.max(record, null);
		System.out.println("Min: "+min+" Max: "+max);
	}

}
