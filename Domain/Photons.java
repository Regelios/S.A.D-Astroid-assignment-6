package Domain;

public class Photons {

	public void initPhotons() {

		int i;

		for (i = 0; i < MAX_SHOTS; i++)
			photons[i].active = false;
		photonIndex = 0;
	}

	public void updatePhotons() {

		int i;

		// Move any active photons. Stop it when its counter has expired.

		for (i = 0; i < MAX_SHOTS; i++)
			if (photons[i].active) {
				if (!photons[i].advance())
					photons[i].render();
				else
					photons[i].active = false;
			}
	}

}
