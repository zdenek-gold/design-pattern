package org.zigi.programming.designpattern.repository;

import static org.junit.Assert.assertSame;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;

public class RepositoryTest {

	@Test
	public void test() {
		FileArticleRepository rep = new FileArticleRepository();

		Article a1 = new Article("New title", "Paul Johanes", new Date());
		Article res1 = rep.create(a1);

		assertSame(a1.getId(), res1.getId());
		assertSame(a1.getTitle(), res1.getTitle());

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1988);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		Date date2 = cal.getTime();
		Article a2 = new Article("Double pong", "Katherine Miclaus", date2);
		rep.create(a2);

		List<Article> articles = rep.read();
		assertSame(articles.size(), 2);

	}

}
