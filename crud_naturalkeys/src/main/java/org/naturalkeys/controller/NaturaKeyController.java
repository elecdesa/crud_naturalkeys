package org.naturalkeys.controller;

import javax.validation.Valid;

import org.naturalkeys.entity.Mensual;
import org.naturalkeys.service.AuxMesesService;
import org.naturalkeys.service.MensualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class NaturaKeyController {

	@Autowired
	private MensualService mensualService;
	@Autowired
	private AuxMesesService auxMesesService;

	@RequestMapping("admin/mensual/list")
	public String list(Model model) {
		model.addAttribute("mensuales", mensualService.list());
		return "dashboard/admin/mensual/list";
	}

	@GetMapping("/admin/mensual/create")
	public String create(Model model) {
		model.addAttribute("mensual", new Mensual());
		model.addAttribute("meses", auxMesesService.list());
		return "dashboard/admin/mensual/postform";
	}

	@PostMapping("/admin/mensual/save")
	public String save(@Valid Mensual mensual, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "dashboard/admin/mensual/postform";
		} else {
			Mensual savedMensual = mensualService.save(mensual);
			return "redirect:/dashboard/admin/mensual/anio/" + savedMensual.getId().getAnio() + "/mes/"
					+ savedMensual.getId().getMes() + "/codalojamiento/" + savedMensual.getId().getCodalojamiento();
		}
	}

	@GetMapping("/admin/mensual/anio/{anio}/mes/{mes}/codalojamiento/{codalojamiento}")
	public String view(@PathVariable String anio, @PathVariable String mes, @PathVariable String codalojamiento,
			Model model) {
		model.addAttribute("mensual", mensualService.findByAnioAndMesAndCodalojamiento(anio, mes, codalojamiento));
		model.addAttribute("mes", auxMesesService.findById(mes));
		return "/dashboard/admin/mensual/view";
	}

	@GetMapping("/admin/mensual/edit/anio/{anio}/mes/{mes}/codalojamiento/{codalojamiento}")
	public String edit(@PathVariable String anio, @PathVariable String mes, @PathVariable String codalojamiento,
			Model model) {
		model.addAttribute("mensual", mensualService.findByAnioAndMesAndCodalojamiento(anio, mes, codalojamiento));
		model.addAttribute("meses", auxMesesService.list());
		return "dashboard/admin/mensual/postform";
	}
}
