<script setup>
import {useRoute, useRouter} from 'vue-router';

const props = defineProps({
  routerName: {
    type: String,
    required: true
  }
});

const route = useRoute();
const router = useRouter();
const clickMenu = (routerName) => {
  router.push({
    name: routerName
  })
}

// div 추가

</script>

<template>
  <div
    class="menu-item"
    @click="clickMenu(routerName)"
  >
    <div
      class="menu-name"
      :class="{ selected: route.name === routerName }"
    >
      <slot></slot>
    </div>
  </div>
</template>

<style lang="scss" scoped>
.menu-item {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  width: 100px;
  cursor: pointer;

  &:hover {
    background-color: $SELECTED-MENU;
  }

  .menu-name {
    user-select: none;

    &.selected {
      position: relative;

      &:after {
        content: '';
        display: block;
        width: 150%;
        height: 5px;
        background-color: #ffffff;
        position: absolute;
        left: -25%;
        bottom: -10px;
      }
    }
  }

}
</style>