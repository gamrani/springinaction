package spring.in.action.Spring.In.Action;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CompactDiskConfig.class)
public class SgtTest {

	@Autowired
	private CcompactDisk compactDisk;
	
	@Test
	public void testPlay() {
		assertNotNull(compactDisk);
	}

}
