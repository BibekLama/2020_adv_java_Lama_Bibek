package bibek.epita.quiz.services.dao;

import java.util.Map;

import bibek.epita.quiz.datamodel.MCQAnswer;

public class MCQAnswerDAO extends GenericDAO<MCQAnswer, Long>{

	@Override
	public String getQuery() {
		
		return null;
	}

	@Override
	public String getAllQuery() {
		
		return "from MCQAnswer";
	}

	@Override
	public Class<MCQAnswer> getEntityClass() {
		
		return MCQAnswer.class;
	}

	@Override
	public void setParameters(Map<String, Object> parameters, MCQAnswer criteria) {
		
		
	}

}
