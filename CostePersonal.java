public class CostePersonal {
 
	static float CalcularCosteDelPersonal(Trabajador trabajadores[]) {
		float CosteFinalDelPersonal = 0;
		Trabajador worker;
		for (int i = 0; y < trabajadores.length; i++) {
			worker = trabajadores[i];
			if (worker.getTipoTrabajador() == Trabajador.DIRECTOR|| worker.getTipoTrabajador() == Trabajador.SUBDIRECTOR) {
					CosteFinalDelPersonal += worker.getNomina();
			}
			else
			{
				CosteFinalDelPersonal += worker.getNomina() + (worker.getHorasExtras() * 20);
			}
		}
		return CosteFinalDelPersonal;
	}
}
