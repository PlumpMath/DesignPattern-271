package min.pattern.observer;

import java.util.List;

public class StatisticsView implements Observer {//StatisticsView는 Observer를 구현함으로써 통보 대상이 됨.

	private ScoreRecord scoreRecord;
	
	public StatisticsView(ScoreRecord scoreRecord) {
		
		this.scoreRecord =scoreRecord; 
	}
	
	@Override
	public void update() {//변경 통보 시 조회된 점수의 합과 평균을 출력함. 
		List<Integer> record = scoreRecord.getScoreRecord();
		displayStatistics(record);
		
	}
	
	private void displayStatistics(List<Integer> record){// 합과 평균 출력
		
		int sum = 0;
		for (int score:record)
			sum += score;
		float average = (float) sum / record.size();
		System.out.println("Sum: "+sum + " Average: "+average);
		
	}

}
