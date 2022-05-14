using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Vecindad
{
    public partial class FormPrincipal : Form
    {
        public FormPrincipal()
        {
            InitializeComponent();
            this.labelValorCostoFijo.Text = FormatearMoneda(33000);
            this.labelValorPiscina.Text = FormatearMoneda(0);
            this.labelValorJuegos.Text = FormatearMoneda(0);
            this.labelValorZonasSociales.Text = FormatearMoneda(0);
            this.labelValorAseo.Text = FormatearMoneda(0);
            this.labelValorSubtotal.Text = FormatearMoneda(0);
            this.labelValorDescuento.Text = FormatearMoneda(0);
            this.labelValorTotal.Text = FormatearMoneda(FormatearMoneda(this.labelValorCostoFijo.Text));
        }

        private void TextBox_Enter(object sender, EventArgs e)
        {
            try
            {
                ((TextBox)sender).BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(234)))), ((int)(((byte)(234)))), ((int)(((byte)(234)))));
            }
            catch
            {
                ((NumericUpDown)sender).BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(234)))), ((int)(((byte)(234)))), ((int)(((byte)(234)))));
            }
        }

        private void TextBox_Leave(object sender, EventArgs e)
        {
            try
            {
                ((TextBox)sender).BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(254)))), ((int)(((byte)(254)))), ((int)(((byte)(254)))));
            }
            catch
            {
                ((NumericUpDown)sender).BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(254)))), ((int)(((byte)(254)))), ((int)(((byte)(254)))));
            }
        }

        private void TextBox_TextChanged(object sender, EventArgs e)
        {
            if (textBoxNroApto.Text.Length > 2 && textBoxDuenio.Text.Length > 0)
            {
                buttonRegistrar.Enabled = true;
                buttonRegistrar.BackColor = System.Drawing.Color.FromArgb((int)((byte)143), ((int)(byte)233), ((int)(byte)233));
            }
            else
            {
                buttonRegistrar.Enabled = false;
                buttonRegistrar.BackColor = System.Drawing.Color.FromArgb((int)((byte)200), ((int)(byte)233), ((int)(byte)233));
            }
            if ((TextBox)sender == textBoxNroApto)
            {
                PisoApto();
            }
            Descuento();
        }

        private void TextBox_KeyPress_LimitarNumeros(object sender, KeyPressEventArgs e)
        {
            if (!char.IsControl(e.KeyChar) && !char.IsDigit(e.KeyChar) && e.KeyChar != '.')
            {
                e.Handled = true;
            }
        }

        private void PisoApto()
        {
            if (textBoxNroApto.Text.Length > 0)
            {
                char pisoNro = textBoxNroApto.Text[0];
                if (pisoNro == '1' || pisoNro == '2')
                {
                    this.labelValorAseo.Text = FormatearMoneda(15000);
                }
                else
                {
                    this.labelValorAseo.Text = FormatearMoneda(0);
                }
            }
            else
            {
                this.labelValorAseo.Text = FormatearMoneda(0);
            }
            CalcularTotal();
        }

        private void CalcularTotal()
        {
            CalcularSubtotal();
            int total = 0;
            total += FormatearMoneda(labelValorSubtotal.Text);
            total -= FormatearMoneda(labelValorDescuento.Text);
            total += FormatearMoneda(labelValorCostoFijo.Text);
            labelValorTotal.Text = FormatearMoneda(total);
        }

        private void CalcularSubtotal()
        {
            int subtotal = 0;
            subtotal += FormatearMoneda(labelValorPiscina.Text);
            subtotal += FormatearMoneda(labelValorJuegos.Text);
            subtotal += FormatearMoneda(labelValorZonasSociales.Text);
            subtotal += FormatearMoneda(labelValorAseo.Text);
            labelValorSubtotal.Text = FormatearMoneda(subtotal);
        }

        private int FormatearMoneda(String texto)
        {
            return int.Parse(texto, NumberStyles.Currency, CultureInfo.CurrentCulture);
        }

        private string FormatearMoneda(int numero)
        {
            return string.Format("{0,0:c}", numero);
        }

        private void NumericUpDown_ValueChanged(object sender, EventArgs e)
        {
            int valorPiscina = 1000;
            int valorJuegos = 5000;
            if ((NumericUpDown)sender == numericUpDownAdultos)
            {
                int value = Convert.ToInt32(Math.Round(numericUpDownAdultos.Value, 0));
                labelValorPiscina.Text = FormatearMoneda(value * valorPiscina);
            }
            else if ((NumericUpDown)sender == numericUpDownNinios)
            {
                int value = Convert.ToInt32(Math.Round(numericUpDownNinios.Value, 0));
                labelValorJuegos.Text = value > 0 ? FormatearMoneda(valorJuegos) : FormatearMoneda(0);
            }

            CalcularTotal();
        }

        private void TextBoxInquilino_TextChanged(object sender, EventArgs e)
        {
            int valorZonasSociales = 10000;
            if (textBoxInquilino.Text.Length > 0)
            {
                labelValorZonasSociales.Text = FormatearMoneda(valorZonasSociales);
            }
            else
            {
                labelValorZonasSociales.Text = FormatearMoneda(0);
            }
            Descuento();
            CalcularTotal();
        }

        private void Descuento()
        {
            if (textBoxInquilino.Text.Equals(textBoxDuenio.Text))
            {
                labelValorDescuento.Text = FormatearMoneda(CalcularDescuento());
            }
            else if (!textBoxInquilino.Text.Equals(textBoxDuenio.Text) || textBoxInquilino.Text.Equals(""))
            {
                labelValorDescuento.Text = FormatearMoneda(0);
            }
        }

        private int CalcularDescuento()
        {
            int descuento = 20;
            int valorDescuento = (FormatearMoneda(labelValorSubtotal.Text) * descuento) / 100;
            return valorDescuento;
        }
    }
}
