package practice.dockerpractice;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class TodoRepository {

    private final JdbcTemplate jdbcTemplate;

    public List<Todo> findAll() {
        String sql = "SELECT * FROM todo";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Todo(
                        rs.getLong("id"),
                        rs.getString("title"),
                        rs.getBoolean("completed")
                ));
    }
}
