<template>
   <div  class="mastfoot">
      <div class="inner">
         <footer  class="mainfooter" role="contentinfo">
            <div class="footer-middle">
               <div class="container">
                  <div class="row">
                     <div class="col-md-4 col-sm-6">
                        <div class="footer-pad">
                           <h4>LinkedIn</h4>
                           <ul class="list-unstyled">
                              <li><a v-bind:href="linkedInLink" target="_blank">{{ linkedInText }}</a></li>
                           </ul>
                        </div>
                     </div>
                     <div class="col-md-4 col-sm-6">
                        <div class="footer-pad">
                           <h4>Twitter</h4>
                           <ul class="list-unstyled">
                              <li><a v-bind:href="twitterLink" target="_blank">{{ twitterText }}</a></li>
                           </ul>
                        </div>
                     </div>
                     <div class="col-md-4 col-sm-6">
                        <div class="footer-pad">
                           <h4>Github</h4>
                           <ul class="list-unstyled">
                              <li><a v-bind:href="githubLink" target="_blank">{{ githubText }}</a></li>
                           </ul>
                        </div>
                     </div>
                  </div>
               </div>
            </div>
            <div class="footer-bottom">
               <div class="container">
                  <div class="row">
                     <div class="col-12">
                        <p class="text-xs-center">&copy; {{ copyrightTextWithYear }}</p>
                     </div>
                  </div>
               </div>
            </div>
         </footer>
      </div>
   </div>
</template>

<script>
export default {
  name: 'app-footer',
  data () {
    return {
      copyrightText: 'Copyright YEAR - sch.digital  All rights reserved.',
      githubText: 'Fork or Star',
      githubLink: 'https://github.com/stefanciprian',
      linkedInText: 'Connect with me',
      linkedInLink: 'https://www.linkedin.com/in/stefanciprianhotoleanu/',
      twitterText: 'Follow me',
      twitterLink: 'https://twitter.com/stefciprian'
    }
  },
  computed: {
    copyrightTextWithYear: function () {
        return this.copyrightText.replace('YEAR', 2018);
    }
  }
}
</script>

<style lang="scss">
//colors
$color_wild_sand_approx: #f5f5f5;

.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: $color_wild_sand_approx;
	.text-muted {
		margin: 20px 0;
	}
}
</style>