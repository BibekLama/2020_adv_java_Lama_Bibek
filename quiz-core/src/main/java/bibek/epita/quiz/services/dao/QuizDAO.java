package bibek.epita.quiz.services.dao;

import java.util.Map;

import bibek.epita.quiz.datamodel.Quiz;

public class QuizDAO extends GenericDAO<Quiz, Long>{
	
	@Override
	public String getQuery() {
		
		return "from Quiz where LOWER(title) LIKE '%' || :pTitle ||'%'";
	}

	@Override
	public void setParameters(Map<String, Object> parameters, Quiz criteria) {
		parameters.put("pTitle", criteria.getTitle());
	}

	@Override
	public Class<Quiz> getEntityClass() {
		
		return Quiz.class;
	}

	@Override
	public String getAllQuery() {
		
		return "from Quiz  ORDER BY ID DESC";
	}

}
