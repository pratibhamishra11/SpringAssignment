package SpringAssignment5.springAssignment5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Service {
	
		private final String url="jdbc:mysql://localhost:3306/spring";
		private final String username="root";
		private final String password="Chinupm@1900";
		
		public List<Trainer> getAllTrainersWithSessions(){
			String  sql="SELECT  t.trainerId,  t.trainerName, s.sessionId, s.sessionName "+
						"FROM trainer t "+
						"LEFT JOIN session s ON t.trainerId = s.sessionId";
			
			List<Trainer> trainers=new ArrayList<>();
			try (Connection con= DriverManager.getConnection(url, username, password);
					PreparedStatement st= con.prepareStatement(sql);
					ResultSet rs=st.executeQuery()){
				Map<Integer, Trainer> trainerMap = new HashMap<>();
				while(rs.next()) {
					int trainerID= rs.getInt("trainerId");
					String trainerName = rs.getString("trainerName");
	                int sessionId = rs.getInt("sessionId");
	                String sessionName = rs.getString("sessionName");

	                Trainer trainer = trainerMap.computeIfAbsent(trainerID, k -> {
	                    Trainer newTrainer = new Trainer();
	                    newTrainer.setId(trainerID);
	                    newTrainer.setName(trainerName);
	                    newTrainer.setSessions(new ArrayList<>());
	                    return newTrainer;
	                });

	                if (sessionId > 0) {
	                    Session session = new Session();
	                    session.setId(sessionId);
	                    session.setName(sessionName);
	                    trainer.getSessions().add(session);
	                }
	            }

	            trainers.addAll(trainerMap.values());
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return trainers;
	    }
	}