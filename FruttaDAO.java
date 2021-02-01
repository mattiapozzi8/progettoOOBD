import java.sql.*;

public class FruttaDAO {
	
	Frutta f = new Frutta();
	
	public FruttaDAO(){
	try {
		Class.forName("org.postgresql.Driver");
	} catch(ClassNotFoundException e) {
		System.out.println("Class not found!\n"+e);
	}
	
	try {
		
		Connection conn = DriverManager.getConnection("jdbc:postgresql://database-1.cyzurhfwamck.us-east-2.rds.amazonaws.com:5432/progetto", "postgres", "progettooobd");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM prodotto, frutta WHERE prodotto.codice_id=frutta.id;");
	
		while(rs.next()) {
			
			f.setNomeProdotto(rs.getString("nome_prodotto"));
			f.setMarca(rs.getString("marca"));
			f.setCodiceID(rs.getString("codice_id"));
			f.setPrezzoAlKilo(rs.getDouble("prezzo"));
     		f.setDataDiScadenza(rs.getDate("data_scadenza"));
			f.setDisponibilit‡(rs.getInt("disponibilita"));
			f.setDataDiRaccolta(rs.getDate("data_raccolta"));
			f.setModalit‡DiConservazione(rs.getString("modalita_conservazione"));

		}
		
			rs.close();
			st.close();
			conn.close();
		
	} catch(SQLException e) {
		System.out.println("SQL Exception\n"+e);
	}
	

}
	}